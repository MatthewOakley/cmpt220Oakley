
class Location{
  
  // default data values
  public int row = 0;
  public int column = 0;
  public double maxValue = 0;
  
  // default constructor
  Location(){
    
  }
  
  public void setMax(double value){
    this.maxValue = value;
  }
  
  public double getMax(){
    return this.maxValue;
  }
  
  public void setRow(int value){
    this.row = value;
  }
  
  public int getRow(){
    return this.row;
  }
  
  public void setColumn(int value){
    this.column = value;
  }
  
  public int getColumn(){
    return this.column;
  }
  
  public Location locateLargest(double[][] a){
    
    // sets a minimum value to first spot in array
    setMax(a[0][0]);
    
    // checks all the columns in a row then goes to next row
    for(int i = 0; i < a.length; i++){
      for(int j = 0; j < a[0].length; j++){
        // if a new larger value is found sets it to that
        if(getMax() < a[i][j]){
          setMax(a[i][j]);
          // gets cords to new largest value
          setRow(i);
          setColumn(j);
        }
      }
    }
    
    // return location
    return this;
  }
}