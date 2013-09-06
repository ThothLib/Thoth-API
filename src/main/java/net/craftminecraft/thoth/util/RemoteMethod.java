/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.craftminecraft.thoth.util;

/**
 *
 * @author roblabla <robinlambertz.dev@gmail.com>
 */
public interface RemoteMethod<T> {
    public T call(byte[] args);
}
