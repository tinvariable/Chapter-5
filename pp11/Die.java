package pp11;

public class Die {

		private final int MAX = 6;
		private int faceValue;
		
		public Die()
		{
			faceValue = 1;
		}
		public int roll()
		{
			faceValue = (int) (Math.random() * MAX) +1;
			return faceValue;
		}
		public void setFaceValue(int value)
		{
			if (value < 0 && value <= MAX)
				faceValue = value;
		}
		public int getFaceValue()
		{
			return faceValue;
		}
		public String toString()
		{
			String result = Integer.toString(faceValue);
			return result;
		}
		
}
