# android-graph-library

Simple Graph Library

Simple graph is a widget to show sequence data in line chart.
There is a simply option to add more kinds of charts in the future by implement class that extends AbstractGraph.

The current graph is presents data for x,y real numbers  points, also negatives numbers.
The x and y axis build themselves dynamically according to the data.


Usage   

The graph can add to container from the XML-layout file, and you can set customs settings (by XYchart:) e.g.

<com.example.gili.simplegraphlibrary.XYchart
        android:id="@+id/graph"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_centerHorizontal="true"
        android:layout_centerVertical="true"
        XYchart:gridLineWidth="3dp"
        XYchart:axisDigitsSize="10dp"
        XYchart:bottomTitleText="X"
        XYchart:leftTitleText="AMOUNT"
        XYchart:labelsColor="#d4c0c0"
        XYchart:backgroundColor="#333131"
        XYchart:axisDigitsColor="#d4c0c0"
        XYchart:valueLineColor="#037cf5"
        XYchart:gridLineColor="#037cf5"/>

or adding programmatically at run time.

Library API

setData(float[] x, float[] y)           -load new data points
addData(float[] x, float[] y)           -add data points collection
addValue(Point p)                       -add new point, this point is from this library's class
addValue(float x, float y)              -add new point by values
List<Point> getAllPoints()              -get list with the entire data
removeValue(Point p)                    -remove specific point(if exists)
removeValue(float x, float y)           -remove specific point(if exists) by values
removeValues(float[] x, float[] y)      -remove points collection
clearData()                             -clear all data
setGridLineColor(int color)             -set border grid color
setBackgrounColor(int color)            -set background color
setLabelsColor(int color)               -set color of left and bottom labels 
