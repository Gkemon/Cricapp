package com.example.user.myapplication;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public
class SquardFragment extends Fragment {


    void goToSquardDetails(String s) {

        Intent intent = new Intent(getContext(), SquardDetails.class);
        intent.putExtra("data", s);
        startActivity(intent);

    }

    public
    SquardFragment() {
        // Required empty public constructor
    }


    @Override
    public
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public
    View onCreateView(LayoutInflater inflater, ViewGroup container,
                      Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_squard, container, false);

        root.findViewById(R.id.bangladesh).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {


                goToSquardDetails("১.মাশরাফি বিন মুর্তজা(অধিনায়ক) \n" +
                        "২.সাকিব আল হাসান \n" +
                        "৩.তামিম ইকবাল খান \n" +
                        "৪.লিটন কুমার দাস \n" +
                        "৫.মাহমুদউল্লাহ রিয়াদ \n" +
                        "৬.মেহেদী হাসান মিরাজ \n" +
                        "৭.মোহাম্মদ মিঠুন \n" + "৮.মোহাম্মদ সাইফউদ্দিন \n" +
                        "৯.মুশফিকুর রহিম \n" +
                        "১০. মোস্তাফিজুর রহমান \n" +
                        "১১.রুবেল হোসেন \n" +
                        "১২.সাব্বির রহমান \n" +
                        "১৩.আবু জায়েদ চৌধুরী রাহী \n" +
                        "১৪.সৌম্য সরকার \n" +
                        "১৫.মোসাদ্দেক হোসেন সৈকত।");
            }
        });

        root.findViewById(R.id.australia).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                goToSquardDetails("১.অ্যারন ফিঞ্চ (অধিনায়ক) \n" +
                        "২.জেসন বেহেনড্রফ \n" +
                        "৩.অ্যালেক্স ক্যারে (উইকেটরক্ষক) \n" +
                        "৪.নাথান কোল্টার-নাইল \n" +
                        "৫.প্যাট কামিন্স। \n" +
                        "৬.উসমান খাজা। \n" +
                        "৭.নাথান লায়ন। \n" +
                        "৮.শন মার্শ। \n" +
                        "৯.গ্লেন ম্যাক্সওয়েল। \n" +
                        "১০.ঝাই রিচার্ডসন। \n" +
                        "১১.স্টিভ স্মিথ। \n" +
                        "১২.মিশেল স্টার্ক। \n" +
                        "১৩.মার্কাস স্টয়নিস। \n" +
                        "১৪.ডেভিড ওয়ার্নার।\n" +
                        " ১৫.অ্যাডাম জাম্পা।");
            }
        });

        root.findViewById(R.id.pk).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                goToSquardDetails("১.সরফরাজ আহমেদ (অধিনায়ক) \n" +
                        "২.ফখর জামান, \n" +
                        "৩.ইমাম উল হক \n" +
                        "৪.বাবর আজম \n" +
                        "৫.শোয়েব মালিক \n" +
                        "৬.মোহাম্মদ হাফিজ \n" +
                        "৭.আসিফ আলি \n" +
                        "৮.শাদাব খান \n" +
                        "৯.ইমাদ ওয়াসিম \n" +
                        "১০.হারিস সোহেল \n" +
                        "১১.হাসান আলি \n" +
                        "১২.শাহীন শাহ আফ্রিদি \n" +
                        "১৩.মোহাম্মদ আমির \n" +
                        "১৪.ওয়াহাব রিয়াজ \n" +
                        "১৫.মোহাম্মদ হাসনাইন।");

            }
        });
        root.findViewById(R.id.nz).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                goToSquardDetails("১.কেন উইলিয়ামসন (অধিনায়ক), \n" +
                        "২.মার্টিন গাপটিল, \n" +
                        "৩. হেনরি নিকোলস, \n" +
                        "৪.রস টেইলর, \n" +
                        "৫. টম লাথাম (উইকেটরক্ষক), \n" +
                        "৬. কলিন মুনরো, \n" +
                        "৭ .টম ব্লান্ডেল, \n" +
                        "৮. কলিন ডি গ্র্যান্ডহোম, \n" +
                        "৯. মিচেল স্যান্টনার, \n" +
                        "১০ .জিমি নিশাম, \n" +
                        "১১ .ইশ সোধি,\n" +
                        "১২. ম্যাট হেনরি, \n" +
                        "১৩.  লুকি ফার্গুসন, \n" +
                        "১৪. টিম সাউদি ও \n" +
                        "১৫.ট্রেন্ট বোল্ট।");

            }
        });
        root.findViewById(R.id.eng).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {
                goToSquardDetails("১.ইয়ন মরগান (অধিনায়ক) \n" +
                        "২.মঈন আলী \n" +
                        "৩.জনি বেয়ারস্টো \n" +
                        "৪.জস বাটলার \n" +
                        "৫.জেমস ভিঞ্চ \n" +
                        "৬.টম কারান \n" +
                        "৭.লিয়াম ডসন \n" +
                        "৮.লিয়াম প্লাঙ্কেট \n" +
                        "৯.আদিল রশিদ \n" +
                        "১০.জো রুট \n" +
                        "১১.জেসন রয় \n" +
                        "১২ বেন স্টোকস \n" +
                        "১৩.জফরা আর্চার\n" +
                        " ১৪.ক্রিস ওকস \n" +
                        "১৫.মার্ক উড।");

            }
        });
        root.findViewById(R.id.sri).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                goToSquardDetails("১)দিমুথ করুনারত্নে(অধিনায়ক), \n" +
                        "২)অ্যাঞ্জেলো ম্যাথিউস, \n" +
                        "৩)লাসিথ মালিঙ্গা, \n" +
                        "৪) কুশল পেরেরা, \n" +
                        "৫) লাহিরু থিরিমান্নে, \n" +
                        "৬)আভিস্কা ফার্নান্ডো, \n" +
                        "৭)কুশল মেন্ডিস, \n" +
                        "৮) ধনঞ্জয় ডি সিলভা, \n" +
                        "৯) জেফরি ভেন্ডারসে, \n" +
                        "১০)থিসারা পেরেরা, \n" +
                        "১১)ইসুরু উসাদা, \n" +
                        "১২) সুরাঙ্গা লাকমাল, \n" +
                        "১৩) নুয়ান প্রদিপ, \n" +
                        "১৪) জীবন মেন্ডিস, \n" +
                        "১৫)মিলিন্দা সিরিওয়ারদিনা।");

            }
        });
        root.findViewById(R.id.sa).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                goToSquardDetails("১.ফাফ দু প্লেসি (অধিনায়ক) \n" +
                        "২.হাশিম আমলা \n" +
                        "৩.কুইন্টন ডি কক \n" +
                        "৪.জেপি ডুমিনি \n" +
                        "৫.এইডেন মারক্রাম \n" +
                        "৬.ডেভিড মিলার \n" +
                        "৭.লুঙ্গি এনগিডি \n" +
                        "৮.আরনিক নরকিয়া \n" +
                        "৯.আন্দিলে ফেলুকওয়ায়ো \n" +
                        "১০.ডোয়াইন প্রিটোরিয়াস \n" +
                        "১১.কাগিসো রাবাদা \n" +
                        "১২.তাবরাইজ শামসি \n" +
                        "১৩.ডেল স্টেইন \n" +
                        "১৪.ইমরান তাহির \n" +
                        "১৫.রাসি ফন ডার ডাসেন।");

            }
        });
        root.findViewById(R.id.win).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                goToSquardDetails(" ১.জেসন হোল্ডার (অধিনায়ক) \n" +
                        "২.ফ্যাবিয়ান অ্যালেন \n" +
                        "৩.ড্যারন ব্রাভো \n" +
                        "৪.কার্লোস ব্র্যাথওয়েট \n" +
                        "৫.শেলডন কটরেল \n" +
                        "৬.শ্যানন গ্যাব্রিয়েল \n" +
                        "৭.ক্রিস গেইল \n" +
                        "৮.শিমরন হেটমায়ার \n" +
                        "৯.শেই হোপ \n" +
                        "১০.এভিন লুইস\n" +
                        " ১১.অ্যাশলি নার্স \n" +
                        "১২.নিকোলাস পুরান \n" +
                        "১৩.কেমার রোচ \n" +
                        "১৪.আন্দ্রে রাসেল \n" +
                        "১৫.ওশান টমাস।");

            }
        });
        root.findViewById(R.id.afgan).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                goToSquardDetails("১.গুলাবদাইন নাইব(অধিনায়ক) \n" +
                        "২.মোহাম্মদ শাহজাদ \n" +
                        "৩.নুর আলম জাদরান \n" +
                        "৪.হযরুতুল্লাহ জাজাই \n" +
                        "৫.রহমত শাহ \n" +
                        "৬.আসগর আফগান \n" +
                        "৭.হাশমতুল্লাহ শহিদী \n" +
                        "৮.নাজিবুল্লাহ জাদরান \n" +
                        "৯.সামিউল্লাহ শেনওয়ারি \n" +
                        "১০.মোহাম্মদ নবি \n" +
                        "১১.রশিদ খান \n" +
                        "১২.দৌলত জাদরান \n" +
                        "১৩.আফতাব আলম \n" +
                        "১৪.হামিদ হাসান \n" +
                        "১৫. মুজিব-উর-রহমান।");

            }
        });
        root.findViewById(R.id.india).setOnClickListener(new View.OnClickListener() {
            @Override
            public
            void onClick(View v) {

                goToSquardDetails("১. বিরাট কোহলি (অধিনায়ক), \n" +
                        "২.রোহিত শর্মা (সহ অধিনায়ক) \n" +
                        "৩.শিখর ধাওয়ান। \n" +
                        "৪.কে এল রাহুল। \n" +
                        "৫.বিজয় শংকর। \n" +
                        "৬.মহেন্দ্র সিং ধোনি (উইকেটকিপার) \n" +
                        "৭.কেদার যাদব। \n" +
                        "৮.দীনেশ কার্তিক। \n" +
                        "৯.যুজবেন্দ্র চাহল। \n" +
                        "১০.কুলদীপ যাদব। \n" +
                        "১১.ভুবনেশ্বর কুমার। \n" +
                        "১২.যশপ্রীত বুমরা। \n" +
                        "১৩.হার্দিক পান্ডিয়া। \n" +
                        "১৪.রবীন্দ্র জাদেজা। \n" +
                        "১৫.মহম্মদ সামি।");
            }
        });


        return root;

    }
}



