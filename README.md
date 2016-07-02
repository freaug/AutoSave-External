# AutoSave-External
An autosave Java external for pre Max7 programs (Max7 has autosave, so this object could cause issues)
<h2>Purpose: </h2>
I have a template of this feature that uses several objects but I wanted to see if I could make an external that would do the same thing.  I chose Java since the external will be compatiable with Mac and Windows (according to the docs).  Every 5 minutes the patch will be saved! 

<h2>Use: </h2>
There two ways to use the external:

1. You can use the attached template autoSave.maxpat
2. You can create a new object <i><b>mxj autoSave</b></i> at any point while working

For either you need to do the following.

Place <i><b>autoSave.class</b></i> and <i><b>autoSave.java</b></i> in the classes folder:
Cycling '74 > java > classes

If you choose option 1 then you will need to place the autoSave.maxpat in the templates folder: Cycling '74 > patches > templates and restart Max.  When the patch loads, a dialog box will appear and prompt you to choose a file name and a save location (it will only do this once)

If you choose option 2 then you will need to make a new <i><b>mxj autoSave</b></i> object.  If you have already saved your patch at anypoint then you will be ok.  <i><b>mxj autoSave</b></i> will keep saving to where your file has already been saved.  Otherwise after 5 minutes a dialog box will appear asking you to choose a file name and a save location.

If you're curious about the code make a new message box with the message viewsource and attach it <i><b>mxj autoSave</b></i>.

I've tested this on Max5 and Max6 on os x yosemite.  Drop me a line if you run into any problems. 
