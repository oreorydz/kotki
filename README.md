ListView lista = findViewById(R.id.lista);

ArrayList<String> zwierzeta = new ArrayList<>();

ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, zwierzeta);
lista.setAdapter(adapter);

lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(MainActivity.this, zwierzeta.get(position), Toast.LENGTH_SHORT).show();
                paseczek.setMax(wiek[position]);
            }
        });

najwazniejsze zeby ten adapter zrobic (android.R.layout.simple_list_item_1, lista)
