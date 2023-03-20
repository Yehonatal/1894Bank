package com._1894._1894.Models;

import com._1894._1894.Views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;
    private Model(){
       this.viewFactory = new ViewFactory();
    }

    public static synchronized Model getInstance(){
        if (model == null){
            model = new Model();
        }
        return model;
    }

    public ViewFactory getViewFactory(){
        return viewFactory;
    }
}
