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

Version 1.3.3 - 21.4.2023
- Added Output Variables to OutputSheet
- Added Output Labels to OutputSheet

Version 1.3.4 - 21.4.2023
- Changed OutputSheet to use GridBagLayout to fix labels

Version 1.3.5 - 22.4.2023
- Finished Setters in OutputSheet

Version 1.3.6 - 22.4.2023
- Finished OutputSheet updater in CharacterSheet

Version 1.3.7 - 24.4.2023
- Added Action Listener to File & Settings Menu

Version 1.3.8 - 24.4.2023
- Added Save & Load Dialogs to File Menu
- TODO: Optional Saving & Loading functionality

Version 1.3.9 - 24.4.2023
- Added New File functionality to File Menu

Version 1.4.0 - 25.4.2023
- Added Popup window to Language & Shortcuts

Version 1.4.1 - 25.4.2023
- Added more output labels to OutputSheet

Version 1.4.2 - 25.4.2023
- Changed output sheet to use X/Y coordinates

Add to Assignment submission:
25.4.2023 - Jouni Lappalainen gave permission to use X/Y Coordinates for the Output label application.

Version 1.4.3 - 25.4.2023
- Added more X/Y Coordinate Labels to outputsheet
- TODO: Saving throws, Skill proficiencies, Equipment

Version 1.4.4 - 27.4.2023
- Added Saving Throws to OutputSheet

Version 1.4.5 - 28.4.2023
- Added Gold, Armor, Weapon and Other to OutputSheet

Version 1.4.6 - 29.4.2023
- Fixed missing Calculation in CharacterSheet'

Version 1.4.7 - 30.4.2023
- Updated OutputSheet Default values

Version 1.4.8 - 30.4.2023
- Added Skill Bonus parameters to OutputSheet

Version 1.4.9 - 30.4.2023
- Added Skill Bonus Labels to OutputSheet

Version 1.5.0 - 30.4.2023
- Commented out Help button on left side menu due to issues caused to CharacterDescription text input fields
- Added Basic Help 0 Window to Menu

Version 1.5.1 - 30.4.2023
- Migrated Help0 to seperate Class

Version 1.5.2 - 30.4.2023
- Added Help1 Class & added Next Help button functionality

Version 1.5.3 - 30.4.2023
- Added Help2 to Help5 classes
- Added Previous button & functionality

Version 1.5.3 - 30.4.2023
- Added Help ? Buttons to Left Side Menu

Version 1.5.4 - 1.5.2023
- Added Descriptions to Help 0, 1 & 2

Version 1.5.5 - 1.5.2023
- Added Descriptions to Help 3, 4 & 5

Version 1.5.6 - 1.5.2023
- Improved Side Menu Panel layout
- changed the starting window size to be Screen resolution dependent

Version 1.5.7 - 2.5.2023
- Updated CharacterDescription panel size
- Removed + symbol from outputsheet

Version 1.5.8 - 2.5.2023
- Updated Character Description fields

Version 1.5.9 - 2.5.2023
- Cleaned up code & Comments

Version 1.6.0 - 2.5.2023
- Updated CharacterDescription

Version 1.6.1 - 2.5.2023
- Cleaned up problems

Version 1.6.2 - 2.5.2023
- Added type String to JComboBoxes
- Resolved most Problems

Version 1.6.3 - 3.5.2023
- Improved Help Descriptions
- Removed Unused Character Description input

Version 1.6.4 - 4.5.2023
- Removed Unused Files & classes

Version 1.6.5 - 4.5.2023
- Changed OutputSheet Image file path to work when exporting to .Jar

Version 1.6.6 - 4.5.2023
-Changed OutputSheet Image file path
-Added Error pop-up for missing image
