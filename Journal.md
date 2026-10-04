# Assignment Journal

## Phase 1

Creating a shared `Creature` superclass is a good idea because all of the creatures have some of the same basic information and behaviors. For example, every creature has a name and a threat level. Instead of creating those variables and methods separately in every creature class, I can put them in one superclass and have the other creature types inherit them. This makes the program easier to organize and reduces duplicate code. It also makes it easier to add more creature types later because they can use the existing `Creature` functionality.