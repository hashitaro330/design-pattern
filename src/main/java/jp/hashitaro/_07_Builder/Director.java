package jp.hashitaro._07_Builder;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    // 文章を作成
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("一般的なあいさつ");
        builder.makeItems(new String[]{
                "How are you?",
                "Hello.",
                "hi.",
        });
        builder.makeString("時間帯に応じたあいさつ");
        builder.makeItems(new String[]{
                "Good morning.",
                "Good afternoon",
                "Good evening",
        });
        builder.close();
    }
}
