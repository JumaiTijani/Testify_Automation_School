// Task 14. LESSON 36
// My Personal Library 2

// Task

// Add a toggleReadingStatus method to your books objects. 
// The method should update the value of the reading property of the book object.
// Remember to log the reading property to the console to confirm the current status.

const book = {
    title:'The Wary Transgressor',
    description:'A crime Fiction',
    numberOfPages: 168,
    author:'James Hadley Chase',
    reading: false,
    toggleReadingStatus: function(){
        if(book.isReading===true) {
            book.isReading = false
        } else {
            book.isReading = true
        }
    }
}

book.toggleReadingStatus()

console.log(book.isReading)