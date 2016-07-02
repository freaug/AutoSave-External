# AutoSave-External
An auto save Java external for pre Max7 programs
<h2>Purpose: </h2>
I have a template of this feature that uses several objects but I wanted to see if I could make an external that would do the same thing.  I chose Java since the external will be compatiable with Mac and Windows (according to the docs).  Every 3 minutes the patch will be saved! 

<h2>Use: </h2>
There two ways to use the external:

1. You can use the attached template autoSave.maxpat
2. You can create a new object <i><b>mxj autoSave</b></i> at any point while working

For either you need to do the following.

Place <i><b>autoSave.class</b></i> and <i><b>autoSave.java</b></i> in the classes folder:
Cycling '74 > java > classes

If you choose option 1 then you will need to place the autoSave.maxpat in the templates folder: Cycling '74 > patches > templates and restart Max.  When the patch loads, a dialog box will appear and prompt you to choose a file name and a save location (it will only do this once, unless you hit cancel then after 3 minutes it will prompt you again.) 

If you choose option 2 then you will need to make a new <i><b>mxj autoSave</b></i> object.  If you have already saved your patch at anypoint then you will be ok as <i><b>mxj autoSave</b></i> will keep saving to its current location.  If you have not saved your patch then when the object is created a dialog box will appear and prompt you to choose a file name and save location (it will only do this once, unless you hit cancel then after 3 minutes it will prompt you again.) 

If you're curious about the code you can send a viewsource message to <i><b>mxj autoSave</b></i>.

<h2>Troubleshooting: </h2>

I've tested the template and mxj object with Max5 and Max6 on OS X Yosemite with no issues.  

If you have any issues the mxj reference is a good place to look: https://docs.cycling74.com/max5/refpages/max-ref/mxj.html or you can drop me a line ed.mc.farr@gmail.com

