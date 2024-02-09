// Task 15/ LESSON 37
// My Personal Library 3

// Task

// You now have more books in your library. You should manage them all in one place. Any idea how you can achieve that?... Arrays!

// Create a books array. 
// 1. Each element of this array will be a book object. 
// 2. Each book object will have the following properties
// 2a. title (string)
// b. description (string)
// c. numberOfPages (number)
// d. author (string)
// e. reading (boolean)
// 3. Use a for-loop to loop through the books array and log all books where the reading status is true to the console

const books = [
    {
        title:'The Wary Transgressor',
        description:'A crime Fiction',
        numberOfPages: 198,
        author:'James Hadley Chase',
        isReading: false
    },
    {
        title:'WILL',
        description:'Autobiography',
        numberOfPages: 425,
        author:'Will Smith and Mark Manson',
        isReading: false
    },
    {
        title:'a bit of difference ',
        description:'African Fiction',
        numberOfPages: 200,
        author:'sefi atta',
        isReading: false
    },
    {
        title:'The Best Couple Ever',
        description:'Suspense Thriller',
        numberOfPages: 480,
        author:'Novoneel Chakraborty',
        isReading: true
    },
    {
        title:'STAY WITH ME',
        description:'Psychological Fiction',
        numberOfPages: 223,
        author:'Ayobami Adebayo',
        isReading: true
    },
    {
        title:'WHEN BREATH BECOMES AIR',
        description:'non-fiction autobiography',
        numberOfPages: 126,
        author:'PAUL KALANITHI',
        isReading: true
    },
]

for (let i = 0; i < books.length; i++) {
    if (books[i].isReading) {
      console.log(books[i]);
    }
  }