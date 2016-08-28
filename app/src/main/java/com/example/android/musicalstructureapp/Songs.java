package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Button a = (Button) findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "A");
                startActivity(intent);
            }
        });

        Button b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "B");
                startActivity(intent);
            }
        });

        Button c = (Button) findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "C");
                startActivity(intent);
            }
        });

        Button d = (Button) findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "D");
                startActivity(intent);
            }
        });

        Button e = (Button) findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "E");
                startActivity(intent);
            }
        });

        Button f = (Button) findViewById(R.id.f);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "F");
                startActivity(intent);
            }
        });

        Button g = (Button) findViewById(R.id.g);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "G");
                startActivity(intent);
            }
        });

        Button h = (Button) findViewById(R.id.h);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "H");
                startActivity(intent);
            }
        });

        Button i = (Button) findViewById(R.id.i);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "I");
                startActivity(intent);
            }
        });

        Button j = (Button) findViewById(R.id.j);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "J");
                startActivity(intent);
            }
        });

        Button k = (Button) findViewById(R.id.k);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "K");
                startActivity(intent);
            }
        });

        Button l = (Button) findViewById(R.id.l);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "L");
                startActivity(intent);
            }
        });

        Button m = (Button) findViewById(R.id.m);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "M");
                startActivity(intent);
            }
        });

        Button n = (Button) findViewById(R.id.n);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "N");
                startActivity(intent);
            }
        });

        Button o = (Button) findViewById(R.id.o);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "O");
                startActivity(intent);
            }
        });

        Button p = (Button) findViewById(R.id.p);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "P");
                startActivity(intent);
            }
        });

        Button q = (Button) findViewById(R.id.q);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "Q");
                startActivity(intent);
            }
        });

        Button r = (Button) findViewById(R.id.ra_rz);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "R");
                startActivity(intent);
            }
        });

        Button s = (Button) findViewById(R.id.s);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "S");
                startActivity(intent);
            }
        });

        Button t = (Button) findViewById(R.id.t);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "T");
                startActivity(intent);
            }
        });

        Button u = (Button) findViewById(R.id.u);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "U");
                startActivity(intent);
            }
        });

        Button v = (Button) findViewById(R.id.v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "V");
                startActivity(intent);
            }
        });

        Button w = (Button) findViewById(R.id.w);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "W");
                startActivity(intent);
            }
        });

        Button x = (Button) findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "X");
                startActivity(intent);
            }
        });

        Button y = (Button) findViewById(R.id.y);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "Y");
                startActivity(intent);
            }
        });

        Button z = (Button) findViewById(R.id.z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Songs.this, Song.class);
                intent.putExtra("group", "Z");
                startActivity(intent);
            }
        });
    }
}
