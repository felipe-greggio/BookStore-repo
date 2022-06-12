# BookStore-repo

An attempt at recreating a book store manager for CRUD operations with some different products (Books, Toys, Games, Movies, Music Albums and Adult products), as well as the possibility of listing the products by type.

At the same time, the project tried following SOLID Principles, to allow for good code patterns.

The project allows for simple CRUD (Create, Read, Update, Delete) operations with the products, as well as a purchase operation, that, after selling the product it is removed  from stock and its price added to the cashier.

The purchase operation also verifies if the product is restricted for adults and if the customer involved in the operation is of legal age (18+). If it isn't, the purchase of that product is blocked by the system (while allowing for non-restricted products to continue to be sold).

Also, if the sale adds up to over $200.00 in books, there is a 15% (fifteeen percent) discount on the book purchase (other products have no such discounts).

Feel free to tinker or improve the project in whatever way you see fit :)
