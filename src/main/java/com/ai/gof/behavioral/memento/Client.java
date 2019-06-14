package com.ai.gof.behavioral.memento;

public class Client {
    public static void main(String[] args) {
        ArticleMementoManager articleMementoManager = new ArticleMementoManager();

        Article article =  new Article("设计模式","手记内容","手记图片");
        ArticleMemento articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        System.out.println("标题："+article.getTitle()+"，内容："+article.getContent()+",图片:"+article.getImgs());
        System.out.println("完整内容:"+article);

        System.out.println("修改手记start");
        article.setTitle("设计模式B");
        article.setContent("手记内容B");
        article.setImgs("手记图片B");
        System.out.println("修改手记end");

        System.out.println("手记完整信息:"+article);

        articleMemento = article.saveToMemento();
        articleMementoManager.addMemento(articleMemento);

        article.setTitle("设计模式C");
        article.setContent("手记内容C");
        article.setImgs("手记图片C");

        System.out.println("暂存回退start");

        System.out.println("回退出栈1次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("回退出栈2次");
        articleMemento = articleMementoManager.getMemento();
        article.undoFromMemento(articleMemento);

        System.out.println("暂存回退end");
        System.out.println("手记完整信息："+article);
    }
}
