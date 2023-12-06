import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AfiliadoDeleteComponent } from './afiliado-delete.component';

describe('AfiliadoDeleteComponent', () => {
  let component: AfiliadoDeleteComponent;
  let fixture: ComponentFixture<AfiliadoDeleteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AfiliadoDeleteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AfiliadoDeleteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
