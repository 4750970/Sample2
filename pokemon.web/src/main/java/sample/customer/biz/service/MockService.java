package sample.customer.biz.service;


/**
 * サービスのモック
 * @author 1
 *
 */
//@Service("mockService")
//public class MockService implements iService<BattleInput, BattleOutput>{
//	
//	private static Log logger = LogFactory.getLog(MockService.class);
//	
//	/**
//	 * 
//	 */
//	public BattleOutput execute(BattleInput input){
//		logger.debug("execute()");
//		
//		Trainer hero = input.getHero();
//		Trainer rival = input.getRival();
//		
//		System.out.println(rival.getType() + "の　" + rival.getName() + "が勝負をしかけてきた！");
//		
//		InBattle friend = new InBattle();
//		friend.setPokemon(hero.getParty()[0]);
//		
//		//手持ちの先頭にいるポケモンをバトル場に出す
//		InBattle opponent = new InBattle();
//		opponent.setPokemon(rival.getParty()[0]);
//		
//		//TODO 最終的に画面に表示するメッセージ
//		System.out.println(rival.getType() + "の　" + rival.getName() + "は" + opponent.getPokemon().getNickName() + "を　くりだした");
//		System.out.println("ゆけっ！　" + friend.getPokemon().getNickName() + "！");
//		
//		return new BattleOutput();
//	}
	
    // サンプル用のMock実装であるため、
    // synchronized等の同期処理は一切おこなわない。
//    private Map<Integer, Customer> customerMap
//                            = new LinkedHashMap<Integer, Customer>();
//    
//    private int nextId = 1;
//
//    private boolean isExists(int id) {
//        return customerMap.containsKey(id);
//    }
//    
//    public List<Customer> findAll() {
//        return new ArrayList<Customer>(customerMap.values());
//    }
//
//    public Customer findById(int id) throws DataNotFoundException {
//        if (!isExists(id)) {
//            throw new DataNotFoundException();
//        }
//        return customerMap.get(id);
//    }
//
//    public Customer register(Customer customer) {
//        customer.setId(nextId++);
//        customerMap.put(customer.getId(), customer);
//
//        return customer;
//    }
//
//    public void update(Customer customer) throws DataNotFoundException {
//        if (!isExists(customer.getId())) {
//            throw new DataNotFoundException();
//        }
//        customerMap.put(customer.getId(), customer);
//    }
//
//    public void delete(int id) throws DataNotFoundException {
//        if (!isExists(id)) {
//            throw new DataNotFoundException();
//        }
//        customerMap.remove(id);
//    }
//
//    public boolean isFreeEmailCustomer(Customer customer) {
//        // この実装では、
//        // Customer#isFreeEmailを呼び出してその結果を返すだけ
//        return customer.isFreeEmail();
//    }
//
//    @PostConstruct
//    public void initCustomer() {
//        nextId = 1;
//
//        register(new Customer("太郎", "東京都新宿区", "taro@aa.bb.cc"));
//        register(new Customer("次郎", "東京都豊島区", "jiro@aa.bb.cc"));
//        register(new Customer("三郎", "東京都板橋区", "sabu@aa.bb.cc"));
//    }
//}
