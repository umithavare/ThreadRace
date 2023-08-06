
## Thread Race

Create an ArrayList containing numbers from 1 to 10,000 (ten thousand). Then, divide the 10,000 elements in this ArrayList into 4 equal parts, each containing 2,500 elements. Design 4 separate Threads that will find even and odd numbers within these 4 individual ArrayLists.

* Each of the 4 Threads will add the found even numbers to a common ArrayList.

* Each of the 4 Threads will add the found odd numbers to a common ArrayList.

* The ArrayLists that hold even and odd numbers will be initially empty when first created. There will be two separate ArrayLists for even and odd numbers.

* When each of the 4 Threads starts processing its own 2,500 element ArrayList, it will fill the common even and odd number ArrayLists accordingly.