package com.ngaini.zoodirectory;

import android.graphics.Typeface;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class DetailActivity extends BaseActivity {
    String value1;
    int value2,value3;
    private String[] description = {"The lion (Panthera leo) is one of the five big cats in the genus Panthera and a member of the family Felidae. The commonly used term African lion collectively denotes the several subspecies found in Africa. With some males exceeding 250 kg (550 lb) in weight,[4] it is the second-largest living cat after the tiger. Wild lions currently exist in sub-Saharan Africa and in Asia (where an endangered remnant population resides in Gir Forest National Park in India) while other types of lions have disappeared from North Africa and Southwest Asia in historic times. Until the late Pleistocene, about 10,000 years ago, the lion was the most widespread large land mammal after humans. They were found in most of Africa, across Eurasia from western Europe to India, and in the Americas from the Yukon to Peru.[5] The lion is a vulnerable species, having seen a major population decline in its African range of 30–50% per two decades during the second half of the twentieth century.[2] Lion populations are untenable outside designated reserves and national parks. Although the cause of the decline is not fully understood, habitat loss and conflicts with humans are currently the greatest causes of concern. Within Africa, the West African lion population is particularly endangered.",
            "The orangutans (also spelled orang-utan, orangutang, or orang-utang)[1] are the two exclusively Asian species of extant great apes. Native to Indonesia and Malaysia, orangutans are currently found in only the rainforests of Borneo and Sumatra. Classified in the genus Pongo, orangutans were considered to be one species. However, since 1996, they have been divided into two species: the Bornean orangutan (P. pygmaeus) and the Sumatran orangutan (P. abelii). In addition, the Bornean species is divided into three subspecies. Based on genome sequencing, the two extant orangutan species evidently diverged around 400,000 years ago. The orangutans are also the only surviving species of the subfamily Ponginae, which also included several other species, such as the three extinct species of the genus Gigantopithecus, including the largest known primate Gigantopithecus blacki. The ancestors of the Ponginae subfamily split from the main ape line in Africa 16 to 19 million years ago (mya) and spread into Asia.",
            "The giant panda (Ailuropoda melanoleuca, lit. \"black and white cat-foot\"; simplified Chinese: 大熊猫; traditional Chinese: 大熊貓; pinyin: dà xióng māo, lit. \"big bear cat\"),[2] also known as panda bear or simply panda, is a bear[3] native to south central China.[1] It is easily recognized by the large, distinctive black patches around its eyes, over the ears, and across its round body. The name \"giant panda\" is sometimes used to distinguish it from the unrelated red panda. Though it belongs to the order Carnivora, the giant panda's diet is over 99% bamboo.[4] Giant pandas in the wild will occasionally eat other grasses, wild tubers, or even meat in the form of birds, rodents or carrion. In captivity, they may receive honey, eggs, fish, yams, shrub leaves, oranges, or bananas along with specially prepared food.",
            "The polar bear (Ursus maritimus) is a carnivorous bear whose native range lies largely within the Arctic Circle, encompassing the Arctic Ocean, its surrounding seas and surrounding land masses. It is a large bear, approximately the same size as the omnivorous Kodiak bear (Ursus arctos middendorffi).[3] A boar (adult male) weighs around 350–700 kg (772–1,543 lb),[4] while a sow (adult female) is about half that size. Although it is the sister species of the brown bear,[5] it has evolved to occupy a narrower ecological niche, with many body characteristics adapted for cold temperatures, for moving across snow, ice, and open water, and for hunting seals, which make up most of its diet.[6] Although most polar bears are born on land, they spend most of their time on the sea ice. Their scientific name means \"maritime bear\", and derives from this fact. Polar bears hunt their preferred food of seals from the edge of sea ice, often living off fat reserves when no sea ice is present. Because of their dependence on the sea ice, polar bears are classified as marine mammals.",
            "Squirrels are members of the family Sciuridae, consisting of small or medium-size rodents. The family includes tree squirrels, ground squirrels, chipmunks, marmots (including woodchucks), flying squirrels, and prairie dogs. Squirrels are indigenous to the Americas, Eurasia, and Africa, and have been introduced to Australia.[1] The earliest known squirrels date from the Eocene and are most closely related to the mountain beaver and to the dormouse among living rodent families."};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value1 = extras.getString("animal_name");
            value2 = extras.getInt("animal_image_value");
            value3 = extras.getInt("position");
        }
//        Toast.makeText(DetailActivity.this, value1+value2 ,Toast.LENGTH_SHORT).show();
        createView(value1,value2, value3);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }

    public void createView(String animal_name_value,int animal_image_value,int position)
    {
        TextView animal_name_id = (TextView) findViewById(R.id.detailActivity_animal_name);

        animal_name_id.setText(animal_name_value);
        ImageView animal_pic_id = (ImageView) findViewById(R.id.detailActivity_animal_image);
        animal_pic_id.setImageResource(animal_image_value);
        TextView animal_description_id = (TextView) findViewById(R.id.detailActivity_animal_description);
        animal_description_id.setText(description[position]);

    }
}
