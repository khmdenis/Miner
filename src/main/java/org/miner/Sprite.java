package org.miner;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by denis on 06.07.16.
 */
public enum Sprite {


    ///Файлы со всеми этими именами должны лежать по адресу
/// *папка проекта*/res/*имя текстуры*.png
    ZERO("0"), ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"),
    SEVEN("7"), EIGHT("8"), HIDEN("space"), BOMB("bomb"), EXPLOSION("explosion"),
    FLAG("flag"), BROKEN_FLAG("broken_flag");

    private Texture texture;

    private Sprite(String texturename){
        try {
            this.texture = TextureLoader.getTexture("PNG", new FileInputStream(new File("res/"+texturename+".png")));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public Texture getTexture(){
        return this.texture;
    }
}
