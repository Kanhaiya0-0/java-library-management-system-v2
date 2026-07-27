## Day 3

### ✅ Progress
- Implemented the Borrow Book feature.
- Implemented the Return Book feature.
- Implemented the Remove Book feature.
- Implemented the Library Statistics feature.
- Completed the code review for all project files.
- Fixed code style issues and reviewed overall project structure.

### 🧠 Concepts Revised
- Code reuse using `searchBook()`.
- Boolean return types for service methods.
- Object references in `ArrayList`.
- `ArrayList.remove(Object)`.
- Counters and statistics using loops.
- Clean method design and single responsibility.
- Basic code review and Java coding conventions.

### 🐛 Problems Faced
- Initially thought borrowing should remove the book from the `ArrayList`; changed the design to update the availability status instead.
- Forgot to update the availability status while designing the Return Book algorithm.
- Added an unnecessary availability check in `removeBook()`.
- Found missing `break` statements during code review, causing switch-case fall-through.
- Found duplicate menu text ("Return Book" instead of "Remove Book").

### 📚 Lessons Learned
- Reuse existing methods instead of rewriting logic (DRY principle).
- Different operations have different responsibilities:
  - Borrow → Change availability.
  - Return → Change availability.
  - Remove → Delete the book from the collection.
- Good code is not only about working correctly but also being clean and readable.
- Code reviews help catch logical and style issues before finalizing a project.

### 🎉 Project Status
Library Management System v1.0 Completed ✅