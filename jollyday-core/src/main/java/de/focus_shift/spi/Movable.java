package de.focus_shift.spi;

import java.util.List;

/**
 * @author sdiedrichsen
 * @version $
 * @since 10.03.20
 */
public interface Movable {
  List<MovingCondition> conditions();
}