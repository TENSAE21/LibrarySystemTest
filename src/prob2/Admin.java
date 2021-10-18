package prob2;

import java.util.*;
import java.util.stream.Collectors;

public class Admin {
	//Returns phone numbers (in sorted order) of the Library Members who have ever checked out the specified lending item
	public static List<String> getPhoneNums(LibraryMember[] members, LendingItem item) {
		List<String> phoneNumsImperative = new ArrayList<>();
		List<String> phoneNumsFunctional = new ArrayList<>();
		//implement
		List<LibraryMember> membersWithItem = new ArrayList<>();

		List<LibraryMember> membersList = Arrays.asList(members);

		//  functional Solution
		phoneNumsFunctional =  membersList.stream()
				.filter(mem -> mem.getCheckoutRecord().getCheckoutEntryList().stream()
								.filter(entry -> entry.getLendingItem().equals(item))
								.collect(Collectors.toList()).size() > 0)
						.map(mem -> mem.getPhone()).sorted()
								.collect(Collectors.toList());


		// Imperative Solution
//		for (LibraryMember member: members) {
//			List<CheckoutRecordEntry> entryList = member.getCheckoutRecord().getCheckoutEntryList();
//			for (CheckoutRecordEntry entry: entryList) {
//				if (entry.getLendingItem().equals(item))
//					membersWithItem.add(member);
//			}
//		}
//
//
//		for(LibraryMember lm : membersWithItem)
//			phoneNumsImperative.add(lm.getPhone());
//
//		Collections.sort(phoneNumsImperative);
//
//		return phoneNumsImperative;
		return phoneNumsFunctional;


	}

//	private static boolean hasItem(List<CheckoutRecordEntry> entries, LendingItem item)
//	{
//		return entries.stream()
//				.filter(entry -> entry.getLendingItem().equals(item))
//				.collect(Collectors.toList()).size() > 0;
//	}


}
