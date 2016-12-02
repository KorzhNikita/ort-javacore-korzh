package ua.dp.ort.module8.task7;

public class RectangleData {

	/**
	 * Поля, которые определяют координаты левого верхнего и правого нижнего
	 * углов прямоугольника
	 */
	private int topLeftX;
	private int topLeftY;
	private int bottomRightX;
	private int bottomRightY;

	/**
	 * Поля координат по умолчанию, в случае создания прямоугольника без
	 * координат
	 */
	final private static int DEFAULT_TOP = 0;
	final private static int DEFAULT_BOTTOM = 2;

	/**
	 * Конструктор со значениями по умолчанию
	 */
	public RectangleData() {
		this(DEFAULT_TOP, DEFAULT_TOP, DEFAULT_BOTTOM, DEFAULT_BOTTOM);
	}

	/**
	 * Конструктор с заданными координатами
	 * 
	 * @param x1 - х левого верхнего угла
	 * 
	 * @param y1 - у левого верхнего угла
	 * 
	 * @param x2 - х правого нижнего угла
	 * 
	 * @param y2- у правого нижнего угла
	 * 
	 */
	public RectangleData(int x1, int y1, int x2, int y2) {
		setTopLeftX(x1);
		setTopLeftY(y1);
		setBottomRightX(x2);
		setBottomRightY(y2);
	}

	/**
	 * get и set методы для полей координат
	 */
	public int getTopLeftX() {
		return topLeftX;
	}

	public void setTopLeftX(int topLeftX) {
		this.topLeftX = topLeftX;
	}

	public int getTopLeftY() {
		return topLeftY;
	}

	public void setTopLeftY(int topLeftY) {
		this.topLeftY = topLeftY;
	}

	public int getBottomRightX() {
		return bottomRightX;
	}

	public void setBottomRightX(int bottomRightX) {
		this.bottomRightX = bottomRightX;
	}

	public int getBottomRightY() {
		return bottomRightY;
	}

	public void setBottomRightY(int bottomRightY) {
		this.bottomRightY = bottomRightY;
	}

	/**
	 * Метод определяет, пересекаются ли между собой 2 прямоугольника
	 * 
	 * @param x - первый прямоугольник
	 *           
	 * @param y - второй прямоугольник         
	 * 
	 */
	public void crossRectangle(RectangleData y) {
		if (
				// Вариант, когда левый верхний угол второго прямоугольника
				// попадает в первый прямоугольник
				pointInRectangle(y.getTopLeftX(), y.getTopLeftY())
				// Вариант, когда правый нижний угол второго прямоугольника
				// попадает в первый прямоугольник
				|| pointInRectangle(y.getBottomRightX(), y.getBottomRightY())
				// Вариант, когда левый нижний угол второго прямоугольника
				// попадает в первый прямоугольник
				|| pointInRectangle(y.getTopLeftX(), y.getBottomRightY())
				// Вариант, когда правый верхний угол второго прямоугольника
				// попадает в первый прямоугольник
				|| pointInRectangle(y.getBottomRightX(), y.getTopLeftY())) {
			System.out.println("Прямоугольники пересекаются\n");
		} else if (getTopLeftX() == y.getTopLeftX() && getTopLeftY() == y.getTopLeftY()
				&& getBottomRightX() == y.getBottomRightX() && getBottomRightY() == y.getBottomRightY()) {
			System.out.println("Прямоугольники равны между собой\n");
		} else {
			System.out.println("Прямоугольники не пересекаются\n");
		}

	}

	/**
	 * Метод определяет попадает ли точка с координатами х и у в прямоугольник
	 * 
	 * @param rectangle - данный прямоугольник
	 *            
	 * @param x- координата х точки
	 *            
	 * @param y- координата у точки
	 *            
	 * @return - тру при попадании точки в прямоугольник фалс в случае если
	 *         точка лежит за кграницами прямоугольника
	 */
	public boolean pointInRectangle(int x, int y) {
		if ((x > getTopLeftX() && x < getBottomRightX())
				&& (y > getTopLeftY() && y < getBottomRightY())) {
			return true;
		} else
			return false;
	}

	/**
	 * Метод маштабирует прямоугольник при условии неподвижности левого верхнего
	 * угла
	 * 
	 * @param rectangle - данный прямоугольник
	 *            
	 * @param x - на сколько увеличить/уменьшит длину прямоугольника
	 *           
	 * @param y - на сколько увеличить/уменьшить ширину прямоугольника
	 *           
	 * @return - маштабированный прямоугольник
	 */
	public RectangleData scalingRectangle(int x, int y) {
		if (-x > (getBottomRightX() - getTopLeftX())
			|| -y > (getBottomRightY() - getTopLeftY())) {
			System.out.println("Уменьшение прямоугольника не возможно на величину превышающую " + 
							"его длину или ширину\n");
			RectangleData rectangle = new RectangleData(getTopLeftX(), 
														getTopLeftY(),
														getBottomRightX(), 
														getBottomRightY());
			return rectangle;
		} else {
			RectangleData rectangle = new RectangleData(getTopLeftX(), 
														getTopLeftY(),
														getBottomRightX() + x, 
														getBottomRightY() + y);
			System.out.println("Изменения внесены\n");
			return rectangle;
		}
	}

	/**
	 * Метод передвигает прямоугольник по плоскости без вращения
	 * 
	 * @param rectangle  - данный прямоугольник
	 *          
	 * @param x - на сколько передвинуть прямоуголник по координате х
	 *         
	 * @param y - на сколько передвинуть прямоуголник по координате у
	 *       
	 * @return - новый прямоугольник
	 */
	public RectangleData displacementRectangle(int x, int y) {
			RectangleData rectangle = new RectangleData
										((getTopLeftX() + x), (getTopLeftY() + y),
										 (getBottomRightX() + x), (getBottomRightY() + y));
			System.out.println("Изменения внесены\n");
			return rectangle;
	}

	/**
	 * Метод выводит прямоугольник в консоль
	 */
	public void printRectangle() {
		char P = '*';
		char O = ' ';
		for(int i = 0; i <= getBottomRightY(); i++) {
			if (i < getTopLeftY()) { 
				System.out.println(O);
			} else {
				for (int j = 0; j < getBottomRightX();j++) {
					if (j < getTopLeftX()) {
						System.out.print(O);
					} else {
						System.out.print(P);
					}	
				} 
				System.out.println(P);
			}
		}
	}
}
