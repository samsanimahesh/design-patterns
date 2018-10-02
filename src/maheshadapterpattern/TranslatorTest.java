package maheshadapterpattern;

public class TranslatorTest {
	public static void main(String[] args) {
		EnglishToItalian eToITranslator = new EnglishToItalian();
		TranslatorImpl translator = new TranslatorImpl(eToITranslator);
		translator.translateToHigher("Hello");
		translator.translateToLower("Chao");
	}

}
