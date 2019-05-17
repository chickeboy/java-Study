package HomeWork7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Manager {
	public ArrayList<TransRecord> add() {
		ArrayList<TransRecord> arrayList = new ArrayList<TransRecord>();
		TreeSet<TransRecord> treeSet = new TreeSet<TransRecord>();
		arrayList.add(new TransRecord("刘德华", 1, "4155990188888888", 300.00));
		arrayList.add(new TransRecord("晓龙", 1, "1155990199999999", 500.00));
		arrayList.add(new TransRecord("黄晓明", 1, "4155990100000000", 1000.50));
		arrayList.add(new TransRecord("张东健", 1, "4155990155555555", 600.99));
		arrayList.add(new TransRecord("梁朝伟", 0, "4155990111111111", 5000.00));
		arrayList.add(new TransRecord("刘德华", 1, "4155990188888888", 200.00));
		arrayList.add(new TransRecord("张东健", 1, "4155990155555555", 500.99));
		arrayList.add(new TransRecord("刘德华", 1, "4155880188888888", 1200.00));
		treeSet.addAll(arrayList);
		arrayList = new ArrayList<TransRecord>();
		arrayList.addAll(treeSet);
		return arrayList;
	}

	public ArrayList<TransRecord> getsum(ArrayList<TransRecord> arrayList, File file) {
		ArrayList<TransRecord> arrayList2 = new ArrayList<TransRecord>();
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String str = null;
			while ((str = bufferedReader.readLine()) != null) {
				String[] strArray = str.split(":");
				String name = strArray[0].toString();
				int sex = Integer.parseUnsignedInt(strArray[1]);
				String account = strArray[2].toString();
				double amount = Double.parseDouble(strArray[3]);
				if (arrayList2.size() == 0) {
					arrayList2.add(new TransRecord(name, sex, account, amount));
				} else {
					int a = arrayList2.size();
					for (int i = 0; i < a; i++) {
						if (arrayList2.get(i).getName().equals(name)&&arrayList2.get(i).getAccount().equals(account) ) {
							arrayList2.get(i).setAmount(amount + arrayList2.get(i).getAmount());
							break;
						}
						if (i == a-1) {
							arrayList2.add(new TransRecord(name, sex, account, amount));
						}
					}
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return arrayList2;

	}

	public void write(ArrayList<TransRecord> arrayList, File file) {
		for (Iterator<TransRecord> iterator = arrayList.iterator(); iterator.hasNext();) {
			TransRecord transRecord = (TransRecord) iterator.next();
			String str = transRecord.writeToString();
			try {
				FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
				bufferedWriter.write(str);
				bufferedWriter.newLine();
				bufferedWriter.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
