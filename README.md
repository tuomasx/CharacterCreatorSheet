Ohjelmointi 4 : Programming 4
Group 20: 
Course Project: D&D Character Sheet Creator App

Changelog:

Version 1.1.1 - 16.4.2023
- Changed Background color to match content
- Aligned Content to the top of the side Menu

Version 1.1.2 - 16.4.2023
- Created CharacterSheet class implementing the variables & functions from DnDCharacterCreator.java
- Added Getters & Setters for CharacterSheet class Inputs
- Created README.md File 

Version 1.1.3 - 16.4.2023
- Added a Scrollbar to the side menu using JScrollPane

Version 1.1.4 - 16.4.2023
- Added CharacterFeatures Class
- Implemented a Dropdown menu for Race & class using JComboBox

Version 1.1.5 - 16.4.2023
- Added Level selector using JSpinner
- Added Background dropdown Menu

Version 1.1.6 - 16.4.2023
- Added CharacterAbilityScore class
- Added added Ability Score selectors using JSpinner

Version 1.1.7 - 16.4.2023
- Added CharacterEquipment class
- Added added Armor dropdown menu using JComboBox

Version 1.1.8 - 16.4.2023
- Added CharacterDescription class
- Added Character description fields

Version 1.1.9 - 16.4.2023
- Added Weapon Select Dropdown
- Added Other item & Gold selections

Version 1.2.0 - 16.4.2023
- Changed CharacterSheet to use Singleton
- Added input reading to CharacterDescription to update CharacterSheet using DocumentListener

Version 1.2.1 - 16.4.2023
- Added DocumentListener CharacterDetails Name & PlayerName
- TODO: Change Age, Gender & Alignment Types to JSpinner, ComboBox & ComboBox

Version 1.2.2 - 17.4.2023
- Added Input reading to CharacterFeatures
- Added ActionListener to Race, Class & Background
- TODO: add input reading to Level

Version 1.2.3 - 17.4.2023
- Updated CharacterSheet Default values to match
- Added DocumentListener to Level JSpinner in CharacterFeatures

Version 1.2.4 - 17.4.2023
- Changed CharacterDetails Age to JSpinner & Added input reading using DocumentReader

Version 1.2.5 - 17.4.2023
- Changed character Alignment & gender to ComboBox & Added input Reading

Version 1.2.6 - 18.4.2023
- Added CharacterSheet Image

Version 1.2.7 - 18.4.2023
- Added Label on top of Image

Version 1.2.8 - 18.4.2023
- Added Input reading to CharacterAbilityScores class

Version 1.2.9 - 18.4.2023
- Added Class OutputSheet & Migrated characterSheet image & label to it.

Version 1.3.0 - 18.4.2023
- Added OutputSheet label updating from name field

Version 1.3.1 - 18.4.2023
- Changed to relative path for baseImage. 
- OutputSheet now displays boolean value of shield.
- CharacterEquipment listener implemented

Version 1.3.2 - 20.4.2023
- Migrated All project files to a src folder to fix path on the default folder created when cloning from git
- Changed File path to get current location root and use it to find the image

