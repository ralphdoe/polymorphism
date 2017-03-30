package model;

import interfaces.Workable;

/**
 * Created by RafaelLopez on 3/30/17.
 */
public class Developer implements Workable
{
    @Override
    public void work() {
        System.out.println("Coding! Coding! Everyday!");
    }
}
