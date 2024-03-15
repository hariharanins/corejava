package Texteditor_MultipleInheritance;

public class wordpad extends Notepad {
   private boolean isbold;
   
   public wordpad() {
	   super();
	   this .isbold = false;
   }
   
   public void formattext(boolean bold) {
	   if (bold){
		   content = "<b>" + content + "<b>";
	   }
	   isbold = bold;
   }
   public boolean isbold() {
	   return isbold;
   }
}
