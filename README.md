# Simple Graph Library for android
<br>
This ducoment in pdf - [README.pdf](https://github.com/gili123/android-graph-library/files/392139/README.pdf)<br>
<br>
Simple graph is a widget to show sequence data in line chart.<br>
There is a simply option to add more kinds of charts in the future by implement class that extends AbstractGraph.<br>
The current graph is presents data for x,y real numbers points, also negatives numbers.<br>
The x and y axis build themselves dynamically according to the data.<br>
<br>

***

## Usage
The graph can add to container from the XML-layout file and you can set customs settings (by XYchart: ), e.g.<br>
<br>
`<com.example.gili.simplegraphlibrary.XYchart`<br>
`android:id="@+id/graph "`<br>
`android:layout_width="match_parent "`<br>
`android:layout_height="match_parent "`<br>
`android:layout_centerHorizontal="true "`<br>
`android:layout_centerVertical="true "`<br>
`XYchart:gridLineWidth="3dp "`<br>
`XYchart:axisDigitsSize="10dp "`<br>
`XYchart:bottomTitleText="X "`<br>
`XYchart:leftTitleText="AMOUNT "`<br>
`XYchart:labelsColor="#d4c0c0 "`<br>
`XYchart:backgroundColor="#333131 "`<br>
`XYchart:axisDigitsColor="#d4c0c0 "`<br>
`XYchart:valueLineColor="#037cf5 "`<br>
`XYchart:gridLineColor="#037cf5 " />`<br>
<br>

or adding programmatically at run time.<br>
<br>

***

## Library API

* setData(float[] x, float[] y) -------- load new data points <br>
* addData(float[] x, float[] y) -------- add data points collection <br>
* addValue(Point p) -------- add new point, this point is from this library's <br> 
* addValue(float x, float y) -------- add new point by values <br> 
* List<Point>getAllPoints() -------- get list with the entire data <br>
* removeValue(Point p) -------- remove specific point(if exists) <br> 
* removeValue(float x, float y) -------- remove specific point(if exists) by values <br> 
* removeValues(float[] x, float[] y) -------- remove points collection <br> 
* clearData() -------- clear all data <br> 
* setGridLineColor(int color) -------- set border grid color <br> 
* setBackgrounColor(int color) -------- set background color <br> 
* setLabelsColor(int color) -------- set color of left and bottom labels <br>
<br>

***

![](https://cloud.githubusercontent.com/assets/11491146/17273736/d9849e56-56c8-11e6-8b7d-27848c398bed.png)
![](https://cloud.githubusercontent.com/assets/11491146/17273734/b43df796-56c8-11e6-9836-bc7150fd4923.png)

