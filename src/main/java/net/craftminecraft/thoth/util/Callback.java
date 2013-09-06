/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.craftminecraft.thoth.util;

/**
 * A callback method
 * @author roblabla <robinlambertz.dev@gmail.com>
 */
public interface Callback<T> {
    /**
     * Called whenever an action is done
     * 
     * @param arg
     */
    public void call(T arg, Throwable err);
}
