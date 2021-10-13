package mx.edu.itm.link.chart

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.androidplot.pie.Segment
import com.androidplot.pie.SegmentFormatter
import mx.edu.itm.link.chart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val s1= Segment("S1", 10)
        val s2= Segment("S2",10)
        val s3= Segment("S3", 10)
        val s4= Segment("S4", 10)

        val sf1= SegmentFormatter(Color.BLUE)
        val sf2= SegmentFormatter(Color.YELLOW)
        val sf3= SegmentFormatter(Color.CYAN)
        val sf4= SegmentFormatter(Color.MAGENTA)

        binding.piechart.addSegment(s1,sf1)
        binding.piechart.addSegment(s2,sf2)
        binding.piechart.addSegment(s3,sf3)
        binding.piechart.addSegment(s4,sf4)


    }


}