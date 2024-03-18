package Texteditor_MultipleInheritance;

public class Word extends wordpad {
   private boolean spellcheckenabled;
   
   public Word() {
	   super();
	   this.spellcheckenabled = true;
   }
   
   public void spellcheck() {
	   if (spellcheckenabled) {
		   System.out.println("running spell check.....");
	   }
	   else {
		   System.out.println("spell check is disabled...");
	   }
	  
	   }
	   public void enablespellcheck(boolean enable) {
		   spellcheckenabled  = enable;
   }
}
