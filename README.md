## Number Of Days In Month

### Description

Write a method <b>isLeapYear</b> with a parameter of type <b>int</b> named <b>year</b>. The parameter needs to be greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that range return <b>false</b>. Otherwise, if it is in the valid range, calculate if the year is a leap year and return <b>true</b> if it is, otherwise return <b>false</b>. 

A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.   

### Examples of input/output

<ul>
<li>isLeapYear(-1600); →  should return <b>false</b> since the parameter is not in the range (1-9999)</li>
<li>isLeapYear(1600); → should return <b>true</b> since 1600 is a leap year</li>
<li>isLeapYear(2017); → should return <b>false</b> since 2017 is not a leap year</li>
<li>isLeapYear(2000); → should return <b>true</b> because 2000 is a leap year </li>
</ul>

Write another method <b>getDaysInMonth</b> with two parameters <b>month</b> and <b>year</b>. ​Both of type int. If parameter month is < 1 or > 12 return -1. If parameter year is < 1 or > 9999 then return -1. This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).

You should check if the year is a leap year using the method <b>isLeapYear</b> described above.

### Examples of input/output

<ul>
<li>getDaysInMonth(1, 2020); → should return 31 since January has 31 days.</li>
<li>getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and 2020 is a leap year.</li>
<li>getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.</li>
<li>getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.</li>
<li>getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.</li>
</ul>
