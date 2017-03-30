package model;

import interfaces.Workable;

/**
 * Created by RafaelLopez on 3/30/17.
 */
public class Designer implements Workable{
    @Override
    public void work() {
        System.out.println("Design User Interfaces! Improving User Experience!");
    }
}
