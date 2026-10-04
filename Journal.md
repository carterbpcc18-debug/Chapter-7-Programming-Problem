# Assignment Journal

## Phase 1

Creating a shared `Creature` superclass is a good idea because all of the creatures have some of the same basic information and behaviors. For example, every creature has a name and a threat level. Instead of creating those variables and methods separately in every creature class, I can put them in one superclass and have the other creature types inherit them. This makes the program easier to organize and reduces duplicate code. It also makes it easier to add more creature types later because they can use the existing `Creature` functionality.

## Phase 2

A Dragon has an "IS-A" relationship with Creature because a Dragon is a type of Creature. The same is true for a Spirit or Golem. By using inheritance, the subclasses automatically receive the common attributes and methods from the Creature class instead of having to define them again. This reduces duplicate code and allows each subclass to focus on its own unique behavior, such as a Dragon breathing fire or a Spirit fading into mist.

## Phase 3

Polymorphism allows me to store different types of creatures in the same collection because Dragon, Spirit, and Golem are all subclasses of Creature. I can use a Creature reference when looping through the roster, and Java will still call the correct overridden `react()` method for each object. This means I don't need a separate loop for each creature type. If a new creature type were added later, as long as it extends Creature and provides its own `react()` method, it could be added to the roster without changing the looping code.