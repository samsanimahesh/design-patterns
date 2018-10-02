package maheshadapterpattern;

public class TranslatorImpl implements LanguageTranslator{
	
	EnglishToItalian eToI;
	
	public TranslatorImpl(EnglishToItalian eToItalian){
		eToI = eToItalian;
	}

	@Override
	public void translateToHigher(String someString) {
		eToI.translateToEnglish(someString);
		
	}

	@Override
	public void translateToLower(String someString) {
		eToI.translateToItalian(someString);
		
	}

}
