package Concrete;

import Abstract.CampaignService;
import Entities.Campaign;

public class BaseCampaignManager implements CampaignService {

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Kampanya Eklendi : " + campaign.getCampaignName());

	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Kampanya Silindi : " + campaign.getCampaignName());

	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Kampanya Güncellendi" + campaign.getCampaignName());

	}

}
