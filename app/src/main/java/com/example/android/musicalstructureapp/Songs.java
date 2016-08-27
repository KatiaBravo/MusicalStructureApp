package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        Button a = (Button) findViewById(R.id.a);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent aIntent = new Intent(Songs.this, A.class);

                startActivity(aIntent);
            }
        });

        Button b = (Button) findViewById(R.id.b);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bIntent = new Intent(Songs.this, B.class);

                startActivity(bIntent);
            }
        });

        Button c = (Button) findViewById(R.id.c);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cIntent = new Intent(Songs.this, C.class);

                startActivity(cIntent);
            }
        });

        Button d = (Button) findViewById(R.id.d);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dIntent = new Intent(Songs.this, D.class);

                startActivity(dIntent);
            }
        });

        Button e = (Button) findViewById(R.id.e);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent eIntent = new Intent(Songs.this, E.class);

                startActivity(eIntent);
            }
        });

        Button f = (Button) findViewById(R.id.f);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fIntent = new Intent(Songs.this, F.class);

                startActivity(fIntent);
            }
        });

        Button g = (Button) findViewById(R.id.g);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gIntent = new Intent(Songs.this, G.class);

                startActivity(gIntent);
            }
        });

        Button h = (Button) findViewById(R.id.h);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hIntent = new Intent(Songs.this, H.class);

                startActivity(hIntent);
            }
        });

        Button i = (Button) findViewById(R.id.i);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iIntent = new Intent(Songs.this, I.class);

                startActivity(iIntent);
            }
        });

        Button j = (Button) findViewById(R.id.j);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent jIntent = new Intent(Songs.this, J.class);

                startActivity(jIntent);
            }
        });

        Button k = (Button) findViewById(R.id.k);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kIntent = new Intent(Songs.this, K.class);

                startActivity(kIntent);
            }
        });

        Button l = (Button) findViewById(R.id.l);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lIntent = new Intent(Songs.this, L.class);

                startActivity(lIntent);
            }
        });

        Button m = (Button) findViewById(R.id.m);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent(Songs.this, M.class);

                startActivity(mIntent);
            }
        });

        Button n = (Button) findViewById(R.id.n);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nIntent = new Intent(Songs.this, N.class);

                startActivity(nIntent);
            }
        });

        Button o = (Button) findViewById(R.id.o);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent oIntent = new Intent(Songs.this, O.class);

                startActivity(oIntent);
            }
        });

        Button p = (Button) findViewById(R.id.p);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pIntent = new Intent(Songs.this, P.class);

                startActivity(pIntent);
            }
        });

        Button q = (Button) findViewById(R.id.q);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent qIntent = new Intent(Songs.this, Q.class);

                startActivity(qIntent);
            }
        });

        Button r = (Button) findViewById(R.id.ra_rz);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rarzIntent = new Intent(Songs.this, RaToRz.class);

                startActivity(rarzIntent);
            }
        });

        Button s = (Button) findViewById(R.id.s);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sIntent = new Intent(Songs.this, S.class);

                startActivity(sIntent);
            }
        });

        Button t = (Button) findViewById(R.id.t);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tIntent = new Intent(Songs.this, T.class);

                startActivity(tIntent);
            }
        });

        Button u = (Button) findViewById(R.id.u);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent uIntent = new Intent(Songs.this, U.class);

                startActivity(uIntent);
            }
        });

        Button v = (Button) findViewById(R.id.v);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vIntent = new Intent(Songs.this, V.class);

                startActivity(vIntent);
            }
        });

        Button w = (Button) findViewById(R.id.w);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wIntent = new Intent(Songs.this, W.class);

                startActivity(wIntent);
            }
        });

        Button x = (Button) findViewById(R.id.x);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent xIntent = new Intent(Songs.this, X.class);

                startActivity(xIntent);
            }
        });

        Button y = (Button) findViewById(R.id.y);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yIntent = new Intent(Songs.this, Y.class);

                startActivity(yIntent);
            }
        });

        Button z = (Button) findViewById(R.id.z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent zIntent = new Intent(Songs.this, Z.class);

                startActivity(zIntent);
            }
        });
    }
}
