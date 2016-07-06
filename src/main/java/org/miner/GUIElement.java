package org.miner;

/**
 * Created by denis on 06.07.16.
 */
public interface GUIElement {
    int getWidth();

    int getHeight();

    int getY();

    int getX();

    Sprite getSprite();

    int receiveClick(int x, int y, int button); /// Возвращаем результат клика

    /// Здесь используется фишка Java 8 --- default методы в интерфейсах.
    ///Если у вас более ранняя версия, вы можете использовать абстрактный класс, вместо интерфейса.
    default boolean isHitted(int xclick, int yclick){
        return ( (xclick > getX()) && (xclick < getX()+this.getWidth()) )
                &&( (yclick > getY()) && (yclick < getY()+this.getHeight()) );
    }
}
