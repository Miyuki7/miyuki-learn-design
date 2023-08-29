package com.miyuki.learn.design;


public interface IMenu {

    /**
     * @param matter:
     * @return com.miyuki.learn.design.IMenu
     * @author miyuki
     * @description 吊顶
     * @date 2023/8/29 22:32
     */
    IMenu appendCeiling(Matter matter);

    /**
     * @param matter:
     * @return com.miyuki.learn.design.IMenu
     * @author miyuki
     * @description 涂料
     * @date 2023/8/29 22:32
     */
    IMenu appendCoat(Matter matter);

    /**
     * 地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 明细
     */
    String getDetail();
}
