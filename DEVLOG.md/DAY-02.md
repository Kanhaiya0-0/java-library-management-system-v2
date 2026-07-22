## Day 2

### ✅ Progress
- Completed the Display Books feature.
- Implemented the Search Book feature.
- Added getters to the Book class.
- Designed `searchBook(int bookId)` to return a `Book` object.
- Connected the search feature with `Main.java`.

### 🧠 Concepts Revised
- Encapsulation using getters.
- Enhanced for loop.
- Returning objects from methods.
- Understanding and using `null`.
- Separation of responsibilities between `Main` and `LibraryService`.
- Proper Scanner usage (`nextInt()` with `nextLine()`).

### 🐛 Problems Faced
- Accidentally created `searchBook()` inside `displayBooks()`.
- Compared an `int` with `null`the hell am i even on atp T-T
- Printed book details inside `searchBook()` instead of returning the `Book`.
- Faced a package error (`The declared package "service" does not match the expected package ""`) which was fixed by restarting the Java Language Server/VS Code.
- Added unnecessary `nextLine()` calls before understanding how Scanner handles input.

### 📚 Lessons Learned
- Every method should have a single responsibility.
- Returning objects makes code reusable.
- `null` represents "no object found."
- Business logic belongs in `LibraryService`; user interaction belongs in `Main`.

### 🎯 Next Goals
- Borrow Book
- Return Book
- Remove Book
- Statistics
- Final cleanup and GitHub README