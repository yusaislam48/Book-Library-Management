package com.oop.tutorialproject.midterm2210118sec2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.Objects;

public class MidtermController
{
    @FXML
    private TableColumn<Book, Integer> bookIdCol;
    @FXML
    private TableColumn<Book, String> bookTitleCol;
    @FXML
    private TextField bookPriceTextField;
    @FXML
    private Label warningLabel;
    @FXML
    private TableColumn<Book, String> BookGenereCol;
    @FXML
    private TextField rangeFromTextField;
    @FXML
    private TableColumn<Book, Float> BookPriceCol;
    @FXML
    private TextField bookIdTextField;
    @FXML
    private TextField bookTitleTextField;
    @FXML
    private TextField rangeToTextField;
    @FXML
    private TableColumn<Book, Integer> noOfBooksCol;
    @FXML
    private ComboBox<String> bookGenreComboBox;

    ArrayList<Book> bookList = new ArrayList<Book>();
    @FXML
    private TableView<Book> bookTable;

    @FXML
    public void initialize() {
        bookGenreComboBox.getItems().setAll("Science Friction", "History", "Romantic", "Short Story", "Novel", "Drama", "Kids");
        bookIdCol.setCellValueFactory(new PropertyValueFactory<Book, Integer>("bookId"));
        bookTitleCol.setCellValueFactory(new PropertyValueFactory<Book, String>("bookTitle"));
        BookGenereCol.setCellValueFactory(new PropertyValueFactory<Book, String>("bookGenre"));
        BookPriceCol.setCellValueFactory(new PropertyValueFactory<Book, Float>("price"));
        noOfBooksCol.setCellValueFactory(new PropertyValueFactory<Book, Integer>("noOfBooks"));
    }


    @FXML
    public void AddNewBookOnClick(ActionEvent actionEvent) {
        int bookId = Integer.parseInt(bookIdTextField.getText());
        String bookTitle = bookTitleTextField.getText();
        String bookGenre = bookGenreComboBox.getValue();
        float price = Float.parseFloat(bookPriceTextField.getText());
        float finalPrice = 0;
        if (price > 0){
            finalPrice = price;
        }else{
            warningLabel.setText("Price is less than 0");
            return;
        }
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getBookId() == bookId){
                warningLabel.setText("Duplicate Book Id");
                return;
            }
        }

        Book book = new Book(bookId, bookTitle, bookGenre, finalPrice);

        bookList.add(book);

//        bookTable.getItems().setAll(bookList);
    }

    @FXML
    public void SearchAndShowOnClick(ActionEvent actionEvent) {
        float rangeFrom = Float.parseFloat(rangeFromTextField.getText());
        float rangeTo = Float.parseFloat(rangeToTextField.getText());
        String genre = bookGenreComboBox.getValue();
        ArrayList<Book> dummyBookList = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getPrice() >= rangeFrom){
                if (bookList.get(i).getPrice() <= rangeTo){
                    if (Objects.equals(bookList.get(i).getBookGenre(), genre)){
                        bookTable.getItems().clear();
//                    bookTable.getItems().add(bookList.get(i));
                        dummyBookList.add(bookList.get(i));

                    }
                }
            }

        }
        bookTable.getItems().setAll(dummyBookList);
    }
}