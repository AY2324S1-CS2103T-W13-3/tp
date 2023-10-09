---
layout: page
title: User Guide
---

**Tran$act** is a simple and easy to use transaction recorder and tracker built in Java.

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

1. Download the latest `transact.jar` from [here].

1. Copy the file to the folder you want to use as the _home folder_ for your tran$act.

1. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar transact.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

1. Refer to the [Features](#features) below for details of each command.

--------------------------------------------------------------------------------------------------------------------

## Features

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* ?: Optional Field
* <description>: Any string
* <type>: [Revenue (R), Expense (E)]
* <amount>: Any number
* <date>: In dd/mm/yy format
* <staff>: Name of staff


### Adding transaction : `add`

Format: `add <type> <description> a/<amount> <date> <?staff>`

Examples:
* `add R Sold 1 Mug a/10 10/10/23 John`
* `add E “Paid Manufacturer” 100 10/11/23`

Success/Fail Output:
* Added revenue (Toast)
* Added expenditure (Toast)
* Error: <Error Message> (Toast)


### Removing transaction: `del`

Format: `del <id>`

Example:`del 1`

Success/Fail Output:
* Removed transaction (Toast)
* Error: <Error Message> (Toast)

### Viewing transactions : `view t`

Switches UI to transaction tabs, which shows the full list of transactions

Format: `view t` or `view transaction`


### Adding staff : `addstaf`

Format: `addstaff n/<name> p/<phone no> e/<email> a/<address> [t/<tag>]`

Success/Fail Output:
* Added staff (Toast)
* Error: <Error Message> (Toast)

### Removing staff: `delstaff`

Format: `delstaff <staff id>`

Example: `delstaff 1`

Success/Fail Output:
* Removed staff (Toast)
* Error: <Error Message> (Toast)


### Viewing staff : `view s`

Switches UI to staff tabs, which shows the full list of staff

Format: `view s` or `view staff`

### Exiting the program : `exit`

Exits the program.

Format: `exit`

### Saving the data

transact data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.


--------------------------------------------------------------------------------------------------------------------

## FAQ

--------------------------------------------------------------------------------------------------------------------

## Known issues


--------------------------------------------------------------------------------------------------------------------

## Command summary

Action | Format, Examples
--------|------------------
**Add transaction** | `add <type> <description> a/<amount> <date> <?staff>`
**Remove transaction** | `del <id>`
**View transaction** | `view t` or `view transaction`
**Add staff** | `addstaff n/<name> p/<phone no> e/<email> a/<address> [t/<tag>]`
**Remove staff** | `delstaff <staff id>`
**View staff** | `view s` or `view staff`
