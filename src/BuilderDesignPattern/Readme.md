Builder

1. CREATIONAL design pattern
2. Uses COMPOSITION
Basically it separates the construction of a complex object from its representation so that the same
construction process can create different representation

So it is a bit different from factory in the sense that, if a new pizza type i.e. suppose special spicy pizza is to be introduced accross all the pizza stores then (Pizza stores) number of classes will need to be created just to introduce a new implementation of pizza creation.

Whereas here, Builder pattern will separate the creation process from the store and can create a new implementation of the pizza via the Director. In our example of pizza stores, the waiter in pizza store or the pizza store can be the director to create the new kind or implementation of pizza across stores.

 