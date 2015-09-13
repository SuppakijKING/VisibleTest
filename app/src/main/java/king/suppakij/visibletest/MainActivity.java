package king.suppakij.visibletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private adminTABLE objAdminTABLE;
    private ownerTABLE objOwnerTABLE;
    private restTABLE objRestTABLE;
    private foodTABLE objFoodTABLE;
    private serviceTABLE objServiceTABLE;

    private ListView index_listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        connectedSQLite();

        bindWidget();

        createListview();

    } // main method onCreate

    private void connectedSQLite() {

        objAdminTABLE = new adminTABLE (this);
        objOwnerTABLE = new ownerTABLE(this);
        objRestTABLE = new restTABLE(this);
        objFoodTABLE = new foodTABLE(this);
        objServiceTABLE = new serviceTABLE(this);

    }//connectedSQLite

    private void createListview() {

        final int[] intIcon =
                {
                        R.drawable.coffee,
                        R.drawable.cake,
                        R.drawable.thaifood,
                        R.drawable.sushi,
                        R.drawable.steak,
                        R.drawable.pizza,
                        R.drawable.bun,
                        R.drawable.flag,
                        R.drawable.letter,
                        R.drawable.plus,
                        R.drawable.login,
                        R.drawable.gear,
                        R.drawable.phone
                };

        final String[] strTitle = new String[13];
        strTitle[0] = "เครื่องดื่ม";
        strTitle[1] = "ของหวาน";
        strTitle[2] = "อาหารไทย";
        strTitle[3] = "อาหารญี่ปุ่น";
        strTitle[4] = "อาหารยุโรป";
        strTitle[5] = "อาหารอิตาเลี่ยน";
        strTitle[6] = "อาหารจีน";
        strTitle[7] = "ศูนย์ให้ความช่วยเหลือ";
        strTitle[8] = "ข้อเสนอแนะ";
        strTitle[9] = "ลงทะเบียนร้านอาหาร";
        strTitle[10] = "เข้าสู่ระบบร้านอาหาร";
        strTitle[11] = "การตั้งค่า";
        strTitle[12] = "ติดต่อเรา";



        AdapterListview objAdapterListview = new AdapterListview(MainActivity.this, intIcon, strTitle);
        index_listview.setAdapter(objAdapterListview);

    } // creat listview

    private void bindWidget() {

        index_listview = (ListView) findViewById(R.id.listView);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
