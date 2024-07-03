<img width="605" alt="Screenshot 2024-07-03 at 6 49 13 PM" src="https://github.com/yusaislam48/Book-Library-Management/assets/67018459/3f5c2063-33a7-46d7-91b7-ddd81cbb5862">

---

# JavaFX Book Management System

This project is a JavaFX application developed as a midterm exam project for the CSE213 course at Independent University, Bangladesh. The application allows users to manage a collection of books, including adding new books and searching for books based on specific criteria.

## Features

- **Add New Book**: Users can add a new book to the collection by providing the book's ID, title, genre, and price. The system validates that the book ID is unique and the price is positive before adding the book to the collection.
- **Search & Show**: Users can search for books of a specific genre and within a specified price range. The search results are displayed in a TableView, showing the book ID, title, genre, and price. Additionally, the TableView includes a column that shows the total number of books created so far.

## Classes and Methods

### Book Class

- **Fields**:
  - `int bookid`
  - `String bookTitle`
  - `String bookGenre`
  - `float price`
- **Methods**:
  - Constructor
  - Getters and Setters
  - `toString()`

### Event Handlers

- **Add New Book to ArrayList**: Creates a new Book object and adds it to an ArrayList called `bookList` after validation.
- **Search & Show**: Filters the `bookList` based on the selected genre and price range, then displays the results in a TableView.

## FXML and SceneBuilder

- The user interface is designed using FXML and SceneBuilder.
- Event handler methods are linked to the buttons and other UI components using `fx:id` and event handler attributes in the FXML file.

## Validation

- Ensures that the book ID is unique and the price is greater than 0 before adding a new book.
- Provides meaningful feedback to the user in case of validation errors.

## TableView

- Displays the search results with columns for book ID, title, genre, price, and the total number of books created so far.

## How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or another IDE that supports JavaFX.
3. Run the application.

## Future Enhancements

- Improve the validation feedback to the user.
- Add more search criteria.
- Implement additional features such as editing and deleting books.

---
