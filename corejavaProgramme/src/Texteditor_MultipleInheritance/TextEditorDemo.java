package Texteditor_MultipleInheritance;

public class TextEditorDemo {

	public static void main(String[] args) {
		Word word = new Word();
		
		word.write("Hello, ");
		word.formattext(true);
		word.write("world!");
		word.displaycontent();
		
		word.spellcheck();
		
		System.out.println("is text is wordpad bold?"+ word.isbold());
        System.out.println("disabling the spell check in word.");
        word.enablespellcheck(false);
        word.spellcheck();
	}

}
