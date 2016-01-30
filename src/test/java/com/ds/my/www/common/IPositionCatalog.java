package com.ds.my.www.common;

import java.util.Set;

/**
 * Created by nemavasi on 30.01.16.
 */
public interface IPositionCatalog {

    IPosition getPositionByName(String name);

    IPosition createNewPosition(String name);

    Set<IPosition> getPositions();


}
