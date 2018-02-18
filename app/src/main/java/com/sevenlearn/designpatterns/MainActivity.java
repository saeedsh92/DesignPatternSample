package com.sevenlearn.designpatterns;

import android.app.Notification;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sevenlearn.designpatterns.builder.Person;
import com.sevenlearn.designpatterns.decorator.HorizontalScrollDecorator;
import com.sevenlearn.designpatterns.decorator.SimpleWindow;
import com.sevenlearn.designpatterns.decorator.VerticalScrollBarDecorator;
import com.sevenlearn.designpatterns.decorator.Window;
import com.sevenlearn.designpatterns.factory.Shape;
import com.sevenlearn.designpatterns.factory.ShapeFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Singleton usage
        SingletonSample.getInstance().doSomething();

        //Factory pattern usage
        Shape circle = ShapeFactory.getShape("Circle");


        //Builder Pattern usage
        Person person = new Person.Builder(123)
                .setFirstName("Saeed")
                .setLastName("Shahini")
                .setAge(27)
                .build();

        //Decorator Pattern
        Window window = new VerticalScrollBarDecorator(new HorizontalScrollDecorator(new SimpleWindow()));
        window.getDescription();

        Window onlyVerticalScrollWindow = new VerticalScrollBarDecorator(new SimpleWindow());



    }
}
