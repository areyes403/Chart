package mx.edu.itm.link.chart

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import com.androidplot.pie.Segment
import com.androidplot.pie.SegmentFormatter

import mx.edu.itm.link.chart.databinding.ActivityPieChartBinding

class pieChart : AppCompatActivity() {

    private lateinit var binding: ActivityPieChartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pie_chart)
        binding= ActivityPieChartBinding.inflate(layoutInflater)
        val view=binding.root
        setContentView(view)

        val arraylist=intent.getIntegerArrayListExtra("arrayList")

        val s1=Segment("S1", arraylist?.get(0))
        val s2=Segment("S1", arraylist?.get(1))
        val s3=Segment("S1", arraylist?.get(2))
        val s4=Segment("S1", arraylist?.get(3))

        val sf1=SegmentFormatter(Color.BLUE)
        val sf2=SegmentFormatter(Color.YELLOW)
        val sf3=SegmentFormatter(Color.CYAN)
        val sf4=SegmentFormatter(Color.MAGENTA)

        binding.piechart.addSegment(s1,sf1)
        binding.piechart.addSegment(s2,sf2)
        binding.piechart.addSegment(s3,sf3)
        binding.piechart.addSegment(s4,sf4)


    }
}