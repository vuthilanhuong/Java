package Assignment_6;

import java.util.ArrayList;
import java.util.Scanner;

interface INews {
    public void Display();
};

public class  News implements INews {
    public int ID;
    public String Title;
    public String PublishDate;
    public String Author;
    public String Content;
    public float AverageRate;

    public News() {
        new ArrayList<Integer>();
    }

    public News(int ID, String title, String publishDate,
                String author, String content, float averageRate) {
        this.ID = ID;
        this.Title = title;
        this.PublishDate = publishDate;
        this.Author = author;
        this.Content = content;
        this.AverageRate = averageRate;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String publishDate) {
        PublishDate = publishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public void setAverageRate(float averageRate) {
        AverageRate = averageRate;
    }

    //    Phương thức Display() sẽ in ra Title, PublishDate,
//    Author, Content và AverageRate của tin tức ra console.
    public void Display() {
        System.out.println("Title:"+this.getTitle());
        System.out.println("PublishDate:"+this.getPublishDate());
        System.out.println("Author:"+this.getAuthor());
        System.out.println("Content:"+this.getContent());
        System.out.println("AverageRate:"+this.getAverageRate());
    }

    public void calculate(ArrayList<Integer> RateList){
        AverageRate= (RateList.get(0)+ RateList.get(1)+ RateList.get(2))/3;
    }
}