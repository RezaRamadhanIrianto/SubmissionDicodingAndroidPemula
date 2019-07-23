package com.example.asus.submissiondicodingandroidpemula;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class detail_page extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);
        TextView judul =  findViewById(R.id.judul);
        TextView judul2 = findViewById(R.id.judul2);
        TextView subjudul =  findViewById(R.id.subjudul);
        ImageView img =  findViewById(R.id.gambar);
        ImageView star1 = findViewById(R.id.star1);
        ImageView star2 = findViewById(R.id.star2);
        ImageView star3 = findViewById(R.id.star3);
        ImageView star4 = findViewById(R.id.star4);
        ImageView star5 = findViewById(R.id.star5);
        TextView text = findViewById(R.id.text);
        ImageView gambar1 = findViewById(R.id.gambar1);
        ImageView gambar2 = findViewById(R.id.gambar2);
        ImageView gambar3 = findViewById(R.id.gambar3);
        TextView deskripsi = findViewById(R.id.deskripsi);

        judul.setText(getIntent().getStringExtra("judul"));
        judul2.setText(getIntent().getStringExtra("judul"));
        subjudul.setText(getIntent().getStringExtra("subjudul"));

        switch (getIntent().getStringExtra("judul")){
            case "Camera" :
                text.setText("Nice");
                star5.setVisibility(View.GONE);
                img.setImageResource(R.drawable.camera);
                gambar1.setImageResource(R.drawable.ic_camera_alt_black_24dp);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.camera);
                deskripsi.setText("MAU CAMERA MIRORLESS DENGAN KUALITAS YANG KEREN TAPI DENGAN HARGA YG GK BIKIN KANTONG JEBOL, INILAH PRODUK TERBARU DARI KAMI DISERTAI FILTER UV MEMBUAT HASIL JEPRETAN ANDA MENGAGUMKAN.\n" +
                        "\n" +
                        "\n" +
                        "24MP 3.0\" TFT LCD 1080P FHD Kamera Digital dengan Filter UV \n" +
                        "Flip LCD / LCD Lipat\n" +
                        "4x digital and optical zoom\n" +
                        "Supports Anti Getar, deteksi senyum wajah\n" +
                        "Supports External SD card up to 32GB\n" +
                        "Terdapat Lampu Flash");
                break;
            case "Keyboard" :
                img.setImageResource(R.drawable.keyboard);
                gambar1.setImageResource(R.drawable.ic_keyboard_black_24dp);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.keyboard);
                deskripsi.setText("Specification :\n" +
                        "* Type : Wired,illuminated,backlight\n" +
                        "* Key Life : More than 10 million times\n" +
                        "* 19 key anti ghosting capability\n" +
                        "* U.S / English Language\n" +
                        "* Double injection keycaps\n" +
                        "* 104 key semi mechanical gaming keyboard\n" +
                        "* Material : ABS\n" +
                        "* Usb Connection\n" +
                        "* Spill Reistant");
                break;
            case "Mouse" :
                text.setText("Not bad");
                star5.setVisibility(View.GONE);
                star4.setVisibility(View.GONE);
                img.setImageResource(R.drawable.mouse);
                gambar1.setImageResource(R.drawable.mouse);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.ic_mouse_black_24dp);
                deskripsi.setText("Feature:\n" +
                        "\n" +
                        "\uFEFF100% brand new and high quality\n" +
                        "\n" +
                        "\uFEFFQuantity: 1\n" +
                        "\n" +
                        "Product Size: 125*80*40mm, the line length is about 1.5m.\n" +
                        "\n" +
                        "\uFEFFUSER for The high-end players, gaming professional players\n" +
                        "\n" +
                        "\uFEFFButtons: 6 buttons with scroll wheel\n" +
                        "\n" +
                        "\uFEFFDPI Max: 3200DPI\n" +
                        "\n" +
                        "\uFEFFErgonomically designed, long-term use without fatigue\n" +
                        "\n" +
                        "\uFEFFIntelligent connectivity, no need to code, plug & play\n" +
                        "\n" +
                        "\uFEFFSwitch Life: 5 million cycle\n" +
                        "\n" +
                        "\uFEFFCompatible for Windows XP, Vista, Windows 7, Windows 8, ME, 2000 and Mac OS...or latest");
                break;
            case "Phone" :
                text.setText("Nice");
                star5.setVisibility(View.GONE);
                img.setImageResource(R.drawable.phone);
                gambar1.setImageResource(R.drawable.ic_phone_android_black_24dp);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.phone);
                deskripsi.setText("Appearance\n" +
                        "Color: Midnight Black, Phantom Purple, Emerald Green\n" +
                        "Dimension: 156.8*75.25*9.0mm\n" +
                        "Weight: 150g\n" +
                        "\n" +
                        "Basic parameters\n" +
                        "Operating System: Android 9.0 Pie\n" +
                        "Processor: MTK6739 4xCortex-A53 up to 1.5GHz\n" +
                        "GPU: IMG GE8100\n" +
                        "Battery: 3400mAh, Built-in Polymer Battery, 5V/1A\n" +
                        "\n" +
                        "Memory\n" +
                        "RAM: 3GB\n" +
                        "ROM: 16GB\n" +
                        "External Storage: Micro SD card (T-Flash card) Up to 128GB");
                break;
            case "Speaker" :
                img.setImageResource(R.drawable.speaker);
                gambar1.setImageResource(R.drawable.ic_speaker_black_24dp);
                gambar2.setImageResource(R.drawable.speaker);
                deskripsi.setText("Sebuah pemutar musik dengan desain dan ukuran mirip seperti speaker compo portabel namun bedanya speaker ini dapat memutar file musik MP3 dari media USB flashdisk dan kartu memori SD-Card melalui speaker stereo dan subwoofer yang sudah terintegrasi. Sumber listriknya menggunakan adaptor (not include battery). Player yang sudah terintegrasi radio FM ini juga berfungsi sebagai speaker mini portabel input audio dari komputer, notebook, handphone maupun dari perangkat pemutar musik lainnya.\n" +
                        "\n" +
                        "Power: with adaptor.. Not include battery.\n" +
                        "\n" +
                        "Drive Speaker: 2x2.75\".\n" +
                        "Power output: 24 Watt RMS.\n" +
                        "Respon Frekuensi: 60Hz - 18KHz.");
                gambar3.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                break;
            case "Headset" :
                img.setImageResource(R.drawable.headphone);
                gambar1.setImageResource(R.drawable.headphone);
                gambar3.setImageResource(R.drawable.ic_headset_black_24dp);
                deskripsi.setText("Satuan 30mm Dinamis\n" +
                        "Frequency Response 5Hz-22,000Hz\n" +
                        "Sensitivitas 102 dB / mW\n" +
                        "Impedansi (pada 1 kHz) 24\n" +
                        "Kabel 1.2m Litz Wire, Y-Type\n" +
                        "Plug L berbentuk berlapis emas Empat-konduktor Stereo Mini\n" +
                        "Approx. Berat (tidak termasuk kabel.) 165g\n" +
                        "\n" +
                        "Mikropon\n" +
                        "Unit / Jenis Listrik Kondensor\n" +
                        "Directivity Omni Direction\n" +
                        "Tingkat terbuka sirkuit tegangan 40dB (0dB = 1V / Pa)\n" +
                        "Frekuensi efektif Mikrofon 20Hz-20,000\n" +
                        "\n" +
                        "Sony MDR-XB450AP merupakan headphone dengan kualitas suara yang jernih dan detail, serta memiliki suara bass yang kuat & mendalam. Headphone ini dilengkapi mikrofon untuk menjawab & menerima panggilan telepon, tombol switch on/off untuk mengatur microphone, dan kabel yang didesain flat dengan panjang kabel hingga 113 cm. Selain itu, headphone ini dilengkapi dengan earcup yang dapat diputar hingga 90 derajat, dan terbuat dari busa lembut sehingga membuat Anda nyaman menggunakannya dalam waktu lama.\n");
                break;
            case "Mic" :
                text.setText("Not bad");
                star5.setVisibility(View.GONE);
                star4.setVisibility(View.GONE);
                img.setImageResource(R.drawable.mic);
                gambar1.setImageResource(R.drawable.ic_mic_black_24dp);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.mic);
                deskripsi.setText("Features:\n" +
                        "Special design for chatting over QQ, MSN, Skype and singing over internet\n" +
                        "3.5 stereo plug fit for all kinds of PC with noise cancellation\n" +
                        "High quality mic, perfect voice recorder\n" +
                        "Conveniently set with the help of stand and clip\n" +
                        "High performance microphone accurately reproduces sound\n" +
                        "Plug in, and start recording-no extra gear needed\n" +
                        "USB plug works with any USB-equipped computer\n" +
                        "Desktop Mic stand, Mic Tripod stand\n" +
                        "High-quality microphone, high-fidelity audio systems.\n" +
                        "With the tripod, set up easily and quickly.\n" +
                        "\n" +
                        "Specifications:\n" +
                        "Model: SF-920\n" +
                        "Directivity: Omnidirectional\n" +
                        "Operation voltage: 1.5V\n" +
                        "Standard operation voltage: 1.5V\n" +
                        "Frequency response: 50Hz-16KHz\n" +
                        "SNR: &gt; 36dB\n" +
                        "Cable length: 2.0m\n" +
                        "Color: Gray+black\n" +
                        "Tripod height: Approx.16 cm--Adjustable\n" +
                        "Size: Approx.15 x 5.5 x 4 cm\n" +
                        "Net Weight: 195.2g\n" +
                        "\n");
                break;
            case "Gamepad" :
                text.setText("Nice");
                star5.setVisibility(View.GONE);
                img.setImageResource(R.drawable.gamepad);
                gambar1.setImageResource(R.drawable.ic_videogame_asset_black_24dp);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.gamepad);
                deskripsi.setText("Professional Game Console I High-durability Material I Easy Handle\n" +
                        "- Konsol dapat dikoneksikan dengan perangkat Android/PC/PS3\n" +
                        "- Mendukung kabel USB On The Go (OTG)\n" +
                        "- Terbuat dari material yang berkualitas sehingga kuat meski digunakan untuk bermain secara frekuentif dan dalam durasi lama.\n" +
                        "- Dilengkapi dengan fitur vibrasi yang akan menambah sensasi permainan.\n" +
                        "- Dilengkapi kabel yang kuat sepanjang 2 meter dengan dual koneksi(0,5 meter micro USB untuktelpon + 1,5 meter kabel USB).\n" +
                        "- Didukung fitur Turbo yang mengoptimalkan aksi Anda saat bermain game.\n" +
                        "- Dilengkapi driver software untuk mengoneksikan konsol dengan perangkat terdukung.");
                break;
            case "Computer":
                img.setImageResource(R.drawable.computer);
                gambar1.setImageResource(R.drawable.ic_computer_black_24dp);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.computer);
                deskripsi.setText("Part Number: 10HVA00LIA\n" +
                        "Layar monitor: LED 18.5 inci wide display\n" +
                        "Prosesor:  \n" +
                        "Chipset: Intel H110 Chipset\n" +
                        "Sistem Operasi: DOS\n" +
                        "Memori RAM: 4 GB DDR3 (Max.16 GB, 2 DIMM Slots)\n" +
                        "Storage: 1 TB HDD SATA 7200 RPM\n" +
                        "Grafis: Intel HD Graphics\n" +
                        "Optical drive: DVD RW Multiburner\n" +
                        "Aksesoris: Keyboard, USB Optical Mouse\n" +
                        "Interface:\n" +
                        "Memory card reader\n" +
                        "Serial port\n" +
                        "Gigabit ethernet");
                break;
            case "dock":
                text.setText("Not recomend");
                star5.setVisibility(View.GONE);
                star4.setVisibility(View.GONE);
                star3.setVisibility(View.GONE);
                img.setImageResource(R.drawable.ic_dock_black_24dp);
                gambar1.setImageResource(R.drawable.computer);
                gambar2.setImageResource(R.drawable.ic_do_not_disturb_alt_black_24dp);
                gambar3.setImageResource(R.drawable.ic_computer_black_24dp);
                deskripsi.setText("Charging Dock USB 3.1 Type C for Smartphone merupakan sebuah produk yang dapat Anda gunakan untuk mengisi ulang daya batre smartphone Anda dengan sebuah dudukan sehingga handphone Anda dapat mengisi ulang daya dengan posisi berdiri, cocok degnan Huawei P9/Xiaomi Mi5/Lg G5, dll.\n" +
                        "\n" +
                        "Features\n" +
                        "Light and small\n" +
                        "Produk ini memiliki berat yang ringan dan kecil sehingga mudah bagi Anda untuk membawanya berpergian.\n" +
                        "\n" +
                        "High Speed Charging\n" +
                        "Type C merupakan terobosan baru untuk charger masa kini, memiliki kecepatan transfer yang tinggi.\n" +
                        "\n" +
                        "Easy to use and storage\n" +
                        "Produk ini sangat mudah untuk Anda gunakan. Anda hanya perlu menyambungkan dock dengan smartphone Anda dan koneksikan docking dengan sumber listrik.\n" +
                        "\n" +
                        "Type C\n" +
                        "produk docking ini dapat mencharger smartphone dengan kecocokan port Type C.\n" +
                        "\n" +
                        "Barang-barang yang Anda dapat dalam kotak produk:\n" +
                        "1 x Charging Dock USB 3.1 Type C for Smartphone\n" +
                        "1 x USB Cable\n");
                break;
        }
    }
}
